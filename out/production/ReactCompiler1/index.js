Effects = [];

function re_render() {
  executeEffectsCallBackOnChange();
  Effects = [];
  document.body.innerHTML = "";
  document.body.insertAdjacentHTML("beforeend", App());
}

const paragraph= ()=>{
  if (typeof count === "undefined") {
     window.count = 5;
  }

  window.setCount = (newVal) => {
    count = newVal;
    re_render();
  };
//const ref=useRef("d");
DepApp15 = {};
DepApp15["prevcount"] = count;
callBackApp15 = ()=>{
console.log("useEffect took effect")
};
addEffect({ callBack: callBackApp15, dependecyArray:DepApp15 });
let Comp=()=>{
return `<span>Comp</span>`
}
let Comp1=()=>{
return `<br/>`
}
    //let child= Comp();
    let props={children: };
//if it starts with a capital letter the component returns a string so the children should look something like this children:compenent()
// if normal jsxElement or  jsxText  then surround with ``

//console.log("ddsfsd");;
return (`<div>
<p>your count is ${ count } </p>
<button onclick="setCount(count+1)"   class="btn btn-primary" >Increase count by one </button>
${
props.children
}
<button onclick="setCount(count-1)"   class="btn btn-danger" >Decrease count by one </button>
 </div>`)
}

function App() {
  return `${paragraph()}`;
}

function render() {
  document.body.insertAdjacentHTML("beforeend", App());
  console.log(Effects);
  Effects.forEach((effect) => {
    if (effect.dependecyArray != null && effect.dependecyArray.length == 0) {
      console.log("from render");
      effect["callBack"]();
    }
  });
}
render();

///////////////////////////////////////////////////////////////////\--useEffect()--\/////////////////////////////////////////////////////////////////

//fucntion to add Effect to the Effects{callBack,dependencyArray} global List
function addEffect({ callBack, dependecyArray = null }) {

  Effects.push({ callBack: callBack, dependecyArray: dependecyArray });
}

// fucntion to see if any of the dependecies of an Effect has chaged since last render
function dependencyChange(dependecyArray) {
  somethingChaged = false;
  for (let key in dependecyArray) {
    newDependencyValue = window[key.substring(4)]; // substring(4) : prevcount --> count

    if (!Object.is(newDependencyValue, dependecyArray[key])) {
      somethingChaged = true;
      dependecyArray[key] = newDependencyValue;
    }
  }
  return somethingChaged;
}

//function to execute the callback of an Effect if any of its dependencies has changed
function executeEffectsCallBackOnChange() {
  Effects.forEach((effect) => {
    if (effect.dependecyArray === null) {
      effect["callBack"]();
    } else if (
      effect.dependecyArray.length !== 0 &&
      dependencyChange(effect["dependecyArray"])
    ) {
      effect["callBack"]();
    }
  });
}
