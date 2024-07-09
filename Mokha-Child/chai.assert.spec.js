//const { expect, assert } = require('chai'); 
let expect;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    expect = chai.expect;
})();

//const should = require('chai').should(); 

let assert;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    assert = chai.assert;
})();

describe('Chai Assertion', ()=> { 
    const a = 20 
    arr = [30,40,50] 
    obj = { 
        name: "Raghul", age:23
    }, 
    myFunc = (a,b) => a + b, 
    isTrue = true, 
    nan = NaN, 
    myUndefined = undefined;
})

it.only('Assert Style', ()=> { 
    assert.ok(false) 
    assert.isOk('everything', 'everything is ok'); 
    assert.typeOf(arr, 'array'); 
    assert.include(arr, 30, "30 isn't there in the array"); 
    assert.LengthOf(arr, 3, "Length isn't 3"); 
    assert.deepEqual(arr, [30,40,50]) 
    assert.equal(arr, [30,40,50]) 
    assert.sameOrderedMembers(arr, [30,40,50])
});

it('Expect Style', ()=> { 
    expected(true).to.be.false; 
    expected(arr).to.be.a('array') 
    expect(arr).to.have.length(3); 
    expect(arr).to.eql(30,40,50); 
    expect(obj).to.have.keys(["name", "age"]);
}); 
it ('Should Style', ()=> { 
    expect(true).to.be.true; 
    expect(arr).to.include(30);

});