/* eslint-disable react/prop-types */
/* eslint-disable no-unused-vars */

import { React, useState } from 'react';

import { Container } from 'react-bootstrap/Container';

import { Row } from 'react-bootstrap/Row';

import { Col } from 'react-bootstrap/Col';

import { Card } from 'react-bootstrap/Card';

import { Alert } from 'react-bootstrap/Alert';

let ste = `onCLick`
const products = [{id:1,name:'Product 1',description:'Description for Product => 1',image:'https://via.placeholder.com/150'},{id:2,name:'Product 2',description:'Description for Product 2',image:'https://via.placeholder.com/150'}]
 function ProductCard ({product,onClick}){
return ( `${Card(Object.assign({style:{width:'18rem',marginBottom:'10px',cursor:'pointer'}},{onClick:()=>{ onClick(product) }},{children:`${Card.Img(Object.assign({variant:"top"},{src:product.image}))}`+`${Card.Body(Object.assign({children:`${Card.Title(Object.assign({children:`${product.name}`}))}`+`${Card.Text(Object.assign({children:`${product.description}`}))}`}))}`}))}` );
}
const ProductDetails = ( {product} )=>{
if(product){
return ( `${Alert(Object.assign({variant:"info"},{children:`Click on a product to see details `}))}` );
}
return ( `<div>
<h2>
${product.name} </h2>
 
<p>
${product.description} </p>
 
<img src=${product.image}  alt=${product.name}  style=${{maxWidth:'100%'}}  /> </div>
` );
};

const App= ()=>{
  if (typeof selectedProduct === "undefined") {
     window.selectedProduct = null;
  }

  window.setSelectedProduct = (newVal) => {
    selectedProduct = newVal;
    re_render();
  };
const handleCardClick = ( product )=>{
setSelectedProduct(product)
};
;
return (`${Container(Object.assign({fluid:true},{children:`test `+`${Row(Object.assign({children:`${Col(Object.assign({s:4},{children:`${products.map(( product )=>{
`${ProductCard(Object.assign({key:product.id},{product:product},{onClick:{ handleCardClick }}))}`
};
)}`}))}`+`${Col(Object.assign({s:8},{children:`${ProductDetails(Object.assign({product:selectedProduct}))}`}))}`}))}`}))}`)
}
export default App;
