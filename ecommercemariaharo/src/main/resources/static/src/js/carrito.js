// Obtener productos del Local Storage
let carritos = localStorage.getItem("carrito");
let productos = JSON.parse(carritos);

// Obtener los elementos donde se imprimen los calculos del carrito
costo_total = document.getElementById("costo_total");
sin_envio = document.getElementById("sin_envio");

// Inicializar total del carrito
let total = 0;

// Elemento plantilla
tarjeta = document.getElementById("plantilla");                         
  
// Recorrer el arreglo de los elementos del carrito
productos.forEach(element => { // Recorrer el arreglo


    // Acumulación de options (select) según el stock del producto
    let acumulador = "";
    for(let cont = 1; cont <= element.stock; cont++){
      if (cont == element.cantidad){
        acumulador += `<option selected>${cont}</option>`
      } else{
        acumulador += `<option>${cont}</option>`
      }
    }

    // Calcular costos
    let subtotal = calcular_subtotal(element);
    total += subtotal;

    // Imprimir card
    tarjeta.innerHTML += `<div class="col-md-4 col-12 tarjeta_c">
    <img src=${element.imagen} alt="..." class = "img-fluid">
  </div>
  <div class="col-md-8 col-12">

  <button type = "button" class = "btn boton_eliminar" id = "eliminar_${element.id}"></button>
    <div class="card-body">
        <h5 class="card-title">${element.nombre}</h5>
        <p class="card-text">${element.caracteristicas}</p>

      <form>
          <div class="form-group">
              <label for="exampleFormControlSelect1">Cantidad</label>
              <select class="form-control opcion" value = "2" id="opcion_${element.id}">
                ${acumulador}
              </select>
          </div>
      </form>


      <p class="precio" id = "precio_${element.id}">Total: $ ${subtotal} MXN</p>
          
    </div>
  </div> `  
                                                    
  });

  // Función que calcula el total por cada producto
  function calcular_subtotal(element){
    sub = element.precio * element.cantidad;
    return sub;
  }

  // Imprimir los cálculos 
  sin_envio.textContent = `$ ${total} MXN`;
  costo_total.textContent = `$ ${total + 50} MXN`;


  // Cambios en la cantidad de elementos
  const op = document.querySelectorAll(`.opcion`);
  op.forEach(seleccion =>{
    seleccion.addEventListener("change", (e_op) => {
      

      // Obtener y elemento por id
      let num = e_op.target.id.split("_")[1]; // va a tener el número
      console.log(num);

      console.log(seleccion.value);

      total = 0;
      productos.forEach(element => {
        if (element.id == num)
        {
          element.cantidad = parseInt(seleccion.value);
        }
        // Calcular costos
        let subtotal = calcular_subtotal(element);
        total += subtotal;

        let sub = document.getElementById("precio_"+element.id);
        sub.textContent = `$ ${subtotal} MXN`;
      });

      // Imprimir los cálculos 
      sin_envio.textContent = `$ ${total} MXN`;
      costo_total.textContent = `$ ${total + 50} MXN`;

      // Guardar los nuevos valores en el Local Storage
      jsonProducto = JSON.stringify(productos);                       
      localStorage.setItem("carrito", jsonProducto);

    });
  });

  // Eliminar productos
  const eliminar = document.querySelectorAll(`.boton_eliminar`);
  eliminar.forEach(elim =>{
    elim.addEventListener("click", (e_del) => {
      
      // Obtener y elemento por id
      let num_el = e_del.target.id.split("_")[1]; 
      console.log(num_el);

      // Eliminar el producto del array y recargar página
      productos = productos.filter((element) => element.id !== parseInt(num_el));
      location.reload();

      // Guardar los nuevos valores en el Local Storage
      jsonProducto = JSON.stringify(productos);                       
      localStorage.setItem("carrito", jsonProducto);
    });
  });


  //Evento de compra
  compra = document.getElementById("compra");
  compra.addEventListener("click", (e_compra)=>{
    e_compra.preventDefault();


    Swal.fire({                                         

      title: '¡Gracias por tu compra!',
      text: "Pedido realizado",
      icon: 'success',
      confirmButtonColor: '#ED959C',
      confirmButtonText: 'Ok.'
    }); 
  });



