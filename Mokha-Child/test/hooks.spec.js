const { before , afterEach } = require("mocha")
let expect;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    expect = chai.expect;
})();

describe('HooksSuite 1' , ()=>{
    before (()=>{
        console.log("before")
    })
    after (()=>{
        console.log("after")
    })
    beforeEach (()=>{
        console.log("before Each")
    })
    afterEach (()=>{
        console.log("afterEach")
    })
});