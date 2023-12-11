const cars = [
    {
        "id": 1,
        "name": "Toyota Camry",
        "model": "2023",
        "price": 28000,
        "fueltype": "Gasoline"
    },
    {
        "id": 2,
        "name": "Honda Civic",
        "model": "2023",
        "price": 24000,
        "fueltype": "Gasoline"
    },
    {
        "id": 3,
        "name": "Ford Mustang",
        "model": "2023",
        "price": 42000,
        "fueltype": "Gasoline"
    },
    {
        "id":4,
        "name": "Tesla Model 3",
        "model": "2023",
        "price": 50000,
        "fueltype": "Electric"
    },
    {
        "id":5,
        "name": "Chevrolet Silverado",
        "model": "2023",
        "price": 35000,
        "fueltype": "Gasoline"
    }
];
 
updateindex = 0;
//   console.log(cars);/
 
function fetchall() {
    const tBody = document.getElementById("cars");
 
    tBody.innerHTML = "";
    const button = document.createElement("button");
 
    cars.forEach((item) => {
 
        let editButton = button.cloneNode(false);
        editButton.innerText = "Edit";
        editButton.setAttribute("onclick", `editItem('${item.id}')`);
 
        // editButton.setAttribute("onclick", `editItem(${'item.name'})`);
 
        let deleteButton = button.cloneNode(false);
        deleteButton.innerText = "Delete";
        deleteButton.setAttribute("onclick", `deleteItem(${item.id})`);
 
        let tr = tBody.insertRow();
 
        let td1 = tr.insertCell(0);
        let id = document.createTextNode(item.id);
        td1.appendChild(id);
 
        let td2 = tr.insertCell(1);
        let name = document.createTextNode(item.name);
        td2.appendChild(name);
 
        let td3 = tr.insertCell(2);
        let model = document.createTextNode(item.model);
        td3.appendChild(model);
 
        let td4 = tr.insertCell(3);
        let price = document.createTextNode(item.price);
        td4.appendChild(price);
 
        let td5 = tr.insertCell(4);
        let fueltype = document.createTextNode(item.fueltype);
        td5.appendChild(fueltype);
 
        let td6 = tr.insertCell(5);
        td6.appendChild(editButton);
 
        let td7 = tr.insertCell(6);
        td7.appendChild(deleteButton);
    });
 
}
 
function saveORupdateItem() {
 
    if (document.getElementById("myBtn").innerHTML == "Save") {
        addItem();
    } else {
        updateItem();
    }
}
 
function addItem() {
    let newCar = {
        "id": document.getElementById('id').value,
        "name": document.getElementById('name').value,
        "model": document.getElementById('model').value,
        "price": document.getElementById('price').value,
        "fueltype": document.getElementById('fueltype').value,
    }
    cars.push(newCar);
    fetchall();
}
 
function updateItem() {
    let updateCar = {
        "id": document.getElementById('id').value,
        "name": document.getElementById('name').value,
        "model": document.getElementById('model').value,
        "price": document.getElementById('price').value,
        "fueltype": document.getElementById('fueltype').value,
    }
 
    const currentitem = cars.find((item) => item.id === parseInt(updateindex));
    currentitem.id = updateCar.id;
    currentitem.name = updateCar.name;
    currentitem.model = updateCar.model;
    currentitem.price = updateCar.price;
    currentitem.fueltype = updateCar.fueltype;
 
    document.getElementById('name').value = '';
    document.getElementById('myBtn').innerHTML = 'submit';
    updateindex = 0;
 
    fetchall();
}
function editItem(id) {
    // alert(editname);
    
    document.getElementById("myBtn").innerHTML = "Update";
    const currentitem = cars.find((item) => item.id === parseInt(id));
    document.getElementById("id").value = currentitem.id;
    document.getElementById("name").value = currentitem.name;
    document.getElementById("model").value = currentitem.model;
    document.getElementById("price").value = currentitem.price;
    document.getElementById("fueltype").value = currentitem.fueltype;
 
    updateindex = id;
    fetchall();
}
 


function deleteItem(id) {
    const delIndex = cars.findIndex((item) => item.id === parseInt(id));
    // const index = cars.findIndex(car => car.name === carNameToFind);
 
    console.log(delIndex);
    cars.splice(delIndex, 1);
    fetchall();
}