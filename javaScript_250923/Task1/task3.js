function loadDoc() {
  const xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("demo").innerHTML =
      this.responseText;
      fetch("https://jsonplaceholder.typicode.com/posts")
  .then(x => x.json())               
  .then(y => {
    const table = document.createElement("table");
    const tbody = document.createElement("tbody");

    y.forEach(item => {
      const row = document.createElement("tr");
        Object.values(item).forEach(value => {
        const cell = document.createElement("td");
        cell.textContent = value;
        row.appendChild(cell);
      });
      tbody.appendChild(row);
    });

    table.appendChild(tbody);
    document.body.appendChild(table);
  })
   .catch(error => console.log(error))
    }
  //};

   xhttp.open("GET", );
  //  xhttp.send();
 //}


