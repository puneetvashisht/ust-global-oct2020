function sync(){
    return "hello!! how are you?"
}
// Puneet
function async(callback){
    console.log(callback)
    setTimeout(function(){
        callback("hello!! how are you?");
    }, 5000);
}
// promises
function asyncWithPromise(){
    return new Promise((resolve, reject) => {
        setTimeout(function(){
            // resolve("hello!! how are you?");
            reject('some error happened')
        }, 5000);
    });
   
}


console.log('start a process')

// Team- UST
// console.log(async(function(res){
//     console.log(res);
//     //stuff
// }))

asyncWithPromise()
.then(res=>console.log(res))
.catch(err=>console.log(err))

console.log('end a process')

