async function buscarDados() {
  const res = await fetch("https://jsonplaceholder.typicode.com/posts/1");
  const data = await res.json();
  return data;
}

buscarDados().then((resultado) => {
  console.log(resultado.title);
});

/*
A função acima está retornando o valor Undefined. Encontre o erro e corrija-o. 
*/
