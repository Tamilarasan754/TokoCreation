window.onload = function(){
    let canvas = document.getElementById("myCanvas");
    let context = canvas.getContext("2d");
    // draw stuff here
     context.beginPath(); 
     //face 
     context.arc(100, 100, 80,0, Math.PI *2,false);
     //smile   
     context.moveTo(160, 100); 
     context.arc(100, 100, 60, 0, Math.PI, false);  
     //left eye 
     context.moveTo(75, 70); 
     context.arc(65, 70, 10, 0, Math.PI * 2, true);  
     //right eye 
     context.moveTo(135, 70); 
     context.arc(125, 70, 10, 0, Math.PI * 2, true); 
    // context.stroke(); 
     context.lineWidth = 5; 
     context.stroke(); 
     


}
function countRabbits() {
    for(let i=1; i<=5; i++) {
      alert("Rabbit number " + i);
    }
  }
  //elem.onclick = function() { // overwrites the existing handler
   // alert("Tamil"); // only this will be shown
//  };
  function toko()
  {
    prompt("Hi Toko");
  }

  function show(){
    alert("details updated");
  }
function validateForm(){
var pname = document.myForm.ProductName.value;
if(pname==null||pname==""){
alert("product name cant be blank");
}
else
{
  var data =document.getElementById('xyz').innerHTML;
  alert(data);
localStorage.setItem('myData', data);
  window.location.href = "data.html";
  //const cars =['bmw','ola','tesla'];
//cars.forEach(car=>console.log(car));
}
return false;


}
function showMessage() {
  window.location.href = "";
  var message = document.getElementById("ProductName").value;
  document.getElementById("display_message").innerHTML = message;
}
function redirectToNextPage() {
  window.location.href = "https://www.google.co.in";
  return false;
}