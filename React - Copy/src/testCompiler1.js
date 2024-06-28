/* eslint-disable react/prop-types */
/* eslint-disable no-unused-vars */
import React, { useState } from 'react';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Card from 'react-bootstrap/Card';
import Alert from 'react-bootstrap/Alert';
let ste=`onCLick`
const products = [
  {
    id: 1,
    name: 'Product 1',
    description: 'Description for Product => 1',
    image: 'https://via.placeholder.com/150'
  },
  {
    id: 2,
    name: 'Product 2',
    description: 'Description for Product 2',
    image: 'https://via.placeholder.com/150'
  },
  // Add more products as needed
];

function ProductCard  ({ product, onClick }) {
  return (
    <Card style={{ width: '18rem', marginBottom: '10px', cursor: 'pointer' }} onClick={() => onClick(product)}>
      <Card.Img variant="top" src={product.image} />
      <Card.Body>
        <Card.Title>{product.name}</Card.Title>
        <Card.Text>{product.description}</Card.Text>
      </Card.Body>
    </Card>
  );
}

const ProductDetails = ( {product} ) => {
 if (!product) {
   return <Alert variant="info">Click on a product to see details</Alert>;
 }
  return (
    <div>
      <h2>{product.name}</h2>

      <p>{product.description}</p>
      <img src={product.image} alt={product.name} style={{ maxWidth: '100%' }} />
    </div>
  );
};

const App = () => {
  const [selectedProduct, setSelectedProduct] = useState(null);

  const handleCardClick = (product) => {
    setSelectedProduct(product);
  };
  return (
    <Container fluid>
    test
      <Row>
        <Col s={4}>
          {products.map((product) => {
            <ProductCard key={product.id} product={product} onClick={handleCardClick} />
          })}
        </Col>
        <Col s={8}>
          <ProductDetails product={selectedProduct} />
        </Col>
      </Row>
    </Container>
  );
};

export default App;