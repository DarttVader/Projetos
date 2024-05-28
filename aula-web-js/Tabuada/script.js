const form = document.getElementById('tabuadaForm');
const tabuadaDiv = document.getElementById('tabuada');
let table; 

form.addEventListener('submit', function(event) {
    event.preventDefault();

    const numero = parseInt(form.numero.value);

    if (Number.isInteger(numero)) {
        if (table) {
            updateTable(numero);
        } else {
            createTable(numero);
        }
    } else {
        tabuadaDiv.textContent = 'Por favor, insira um número inteiro válido.';
    }
});

function createTable(numero) {
    tabuadaDiv.innerHTML = '';
    table = document.createElement('table');
    const thead = document.createElement('thead');
    const tbody = document.createElement('tbody');

    const headerRow = document.createElement('tr');
    const emptyHeaderCell = document.createElement('th');
    headerRow.appendChild(emptyHeaderCell); 
    for (let i = 1; i <= 10; i++) {
        const th = document.createElement('th');
        th.textContent = i;
        headerRow.appendChild(th);
    }
    thead.appendChild(headerRow);
    table.appendChild(thead);

    for (let i = 1; i <= 10; i++) {
        const row = document.createElement('tr');
        
        const multiplicadorCell = document.createElement('td');
        multiplicadorCell.textContent = i;
        row.appendChild(multiplicadorCell);

        for (let j = 1; j <= 10; j++) {
            const cell = document.createElement('td');
            cell.textContent = i * j;
            row.appendChild(cell);
        }
        tbody.appendChild(row);
    }

    table.appendChild(tbody);
    tabuadaDiv.appendChild(table);
}

function updateTable(numero) {
    const tbody = table.querySelector('tbody');

    for (let i = 1; i <= 10; i++) {
        const row = tbody.children[i - 1];
        const multiplicador = row.children[0];
        multiplicador.textContent = i;
        
        for (let j = 1; j <= 10; j++) {
            const cell = row.children[j];
            cell.textContent = i * numero;
        }
    }
}
