class Product{
    constructor(a,name,quantity,price){
        this.id=a;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    toString() {
        return `Product{${this.id},${this.name},${this.quantity},${this.price}}`
    }

} 

let pro1=new Product(10,"Iphone",10,110000);
let pro2=new Product(1,"Glaxy",10,14000);
let pro3=new Product(3,"Zenphone",10,44000);
let products=[pro1,pro2,pro3];

function onLoad(){
 loadProducts();
}
function loadProducts() {
    for (let index = 0; index < products.length; index++) {
        let product=products[index];
        document.getElementById("tbody").innerHTML+=`
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.quantity}</td>
            <td>${product.price}</td>
        </tr>
        `;
    }
}
function addProduct() {
    let product=new Product(10,"Iphone",10,110000);
   products.push(product);
}