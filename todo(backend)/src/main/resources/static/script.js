const todoInput = document.getElementById("todo-input");
const addBtn = document.getElementById("add-btn");
const todoList = document.getElementById("todo-list");
const completedCount = document.getElementById("completed-count");
const totalCount = document.getElementById("total-count");

const BASE_URL = "http://localhost:8080/api/todos";

let todos = [];

async function fetchTodos() {
  const response = await fetch(BASE_URL);
  todos = await response.json();
  renderTodos();
}

async function addTodo() {
  const todoText = todoInput.value.trim();
  if (todoText) {
    const todo = { text: todoText, completed: false };

    const response = await fetch(BASE_URL, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(todo),
    });

    if (response.ok) {
      const newTodo = await response.json();
      todos.push(newTodo);
      renderTodos();
      todoInput.value = "";
    }
  }
}

async function toggleComplete(id) {
  const todo = todos.find((t) => t.id === id);
  if (todo) {
    todo.completed = !todo.completed;

    await fetch(`${BASE_URL}/${id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ completed: todo.completed }),
    });

    renderTodos();
  }
}

async function deleteTodo(id) {
  await fetch(`${BASE_URL}/${id}`, { method: "DELETE" });
  todos = todos.filter((t) => t.id !== id);
  renderTodos();
}

function renderTodos() {
  // Sort todos: incomplete todos first, completed todos last
  todos.sort((a, b) => a.completed - b.completed);

  todoList.innerHTML = "";
  todos.forEach((todo) => {
    console.log(todo);
    const li = document.createElement("div");
    li.classList.toggle("completed", todo.completed);
    li.innerHTML = `
            
        <div>
            <div id="todo_bar" key=${todo.id}>
            <div class="flex">
            <div class="bullet"></div>
            <span class="${todo.completed ? "checked" : ""}" id="text-box">${
              todo.text
            }</span>
            </div>
            <div id="buttons">
            <button class="green btn1" onclick="toggleComplete('${
              todo.id
            }')">✔</button>
            <button class="red btn1" onclick="deleteTodo('${
              todo.id
            }')">✖</button>
            </div>
            </div>
            </div>
        `;
    todoList.appendChild(li);
  });

  updateCounts();
}

function updateCounts() {
  const completed = todos.filter((t) => t.completed).length;
  const total = todos.length;
  completedCount.textContent = completed;
  totalCount.textContent = total;
}

addBtn.addEventListener("click", addTodo);
window.addEventListener("DOMContentLoaded", fetchTodos);
