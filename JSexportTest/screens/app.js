export default function App(){
function fn(){
console.log("ddddddddddddddddddddddd")
}

const count = 1;
return (( ()=>{const button = document.createElement('button');
	 button.insertAdjacentHTML('beforeend', (()=>{
  							const childText= (count);
  							if(childText instanceof HTMLElement){
  							    return childText.outerHTML
  							}else{
  							return childText
  							}
  								})()); button.addEventListener('click',fn);return button})())

}
