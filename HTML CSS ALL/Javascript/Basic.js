// Hello!           //Answer 1
/*Javascript
Basic*/

                    //Answer 2
// Create and display an array:
const fruits = ["Banana", "Orange", "Apple", "Mango"];

fruits.sort();
fruits.reverse();
document.writeln("<br>"+fruits);

const points = [40, 100, 1, 5, 25, 10];
points.sort(function(a,b){
    return (b - a)
})
document.write("<br>" + points);

for(var i=0; i<=10 ; i++){              //Answer 3
    document.writeln("<br>" + "i = "+i);
}

var firstName = "Rituraj";          //Answer 4
var lastName = "Singh";

var person = { firstName, lastName }
document.write("<br>"+firstName+" "+lastName);

x = 5;
elem = document.getElementById("demo1");         //Answer 5
elem.innerHTML = x;
var x

function fun() {  
    document.getElementById("div").style.display = "none";  
    document.getElementById("p").style.display = "none";  
    }  

//The call() method takes arguments separately. The apply() method takes arguments as an array.

var count = 0;
    var btn = document.getElementById("btn1");
    var disp = document.getElementById("display");
  
    btn.onclick = function () {
        count++;
        disp.innerHTML = count;
    }