//const { expect } = require('chai');
const {add,sub,multiply,divide} = require('../src/app')
//const expect = require('chai').expect
let expect;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    expect = chai.expect;
})();
//1.BDD - 'describe' and 'it'
// describe('Suite 1', () => {
//     it('add(2,3) should return 5',()=>{
//         expect(add(2,3)).to.be.equal(5);
//     })
// })
// describe('Suite 2', () => {
//     it('sub(12,3) should return 9',()=>{
//         expect(sub(12,3)).to.be.equal(9);
//     })
// })
// describe('Suite 3', () => {
//     it('multiply(12,3) should return 36',()=>{
//         expect(multiply(12,3)).to.be.equal(36);
//     })
// })
// describe('Suite 4', () => {
//     it('divide(12,3) should return 4',()=>{
//         expect(divide(12,3)).to.be.equal(4);
//     })
// })
const {suite,test,setup,teardown,suiteSetup,suiteTeardown} = require('mocha')
suite('TDD hooks',() => {
    suiteSetup( ()=>{
        console.log("one suite setup")
    });
    suiteTeardown( ()=>{
        console.log("one suite Teardown")
    });
    setup( ()=>{
        console.log("one setup")
    });
    suiteSetup( ()=>{
        console.log("one suite setup")
    });
    teardown( ()=>{
        console.log("one teardown")
    });
    test('add(5,8) should return 13',()=>{
        console.log('one test')
    });
})