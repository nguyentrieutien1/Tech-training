// CALLBACK -> 1 ham nhan vao 1 doi so, ma doi so do la 1 function (callback)()
// PROMISE, ASYNC AWAIT -> 1 Object promise nhan vao 1 callback, resovel, reject
// Resovel, Reject, Pending

const promise = new Promise((resolve, r) => {
  resolve(123);
});

const asyncF = async () => {
    const number = 1;
  number = 2;
  return number;
}

const main = async () => {
  try {
    const result = await asyncF();
    console.log(result);
  } catch (error) {
    console.log("Error server !");
  }
}
main();
// Promise
// 1 -> .then and catch
// 2 -> async await

