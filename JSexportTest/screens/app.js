export default function App(){

const count = 1;
return (( ()=>{const h1 = document.createElement('h1');
	 h1.insertAdjacentHTML('beforeend','text '); h1.insertAdjacentHTML('beforeend', (()=>{
  							const childText= (count);
  							if(childText instanceof HTMLElement){
  							    return childText.outerHTML
  							}else{
  							return childText
  							}
  								})()); h1.insertAdjacentHTML('beforeend','text2 '); return h1})())


}
