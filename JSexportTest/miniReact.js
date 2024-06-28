const Effects = [];

function re_render() {
  executeEffectsCallBackOnChange();
  Effects = [];
  document.body.innerHTML = "";
  document.body.insertAdjacentHTML("beforeend", App());
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
//render();

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


export {Effects,re_render,render,addEffect}