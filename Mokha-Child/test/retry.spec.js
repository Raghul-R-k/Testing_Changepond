//const { expect } = require('chai');
const axios = require("axios") ;
let expect;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    expect = chai.expect;
})();

describe('Test Suite 1',function(){
    this.retries(3);
    it('Promised based way ',function(){
        this.retries(3);
        return axios.get('https://reqres.in/api/users?page=2')
        .then(res =>{
            expect(res.data.data[1].email).to.be.equal('lindsay.ferguson@reqes.in');
        })
        .catch(err =>{
            console.error('Error during test: ',err);
            throw err;
        });
    });
});