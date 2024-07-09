const axios = require("axios") ;
let expect;
(async ()=> {
    const chai = await import('chai');  //importing chai explictly
    expect = chai.expect;
})();

describe('Test Suite 1',function(){
    it('Promised based way ',function(){
        this.timeout(20);
        return axios.get('https://reqres.in/api/users?page=2')
        .then(res =>{
            expect(res.data.data[1].email).to.be.equal('lindsay.ferguson@reqres.in');
        })
        .catch(err =>{
            console.error('Error during test: ',err);
            throw err;
        });
    });
});
describe.skip('Test Suite 1',function(){
    it('Promised based way ',function(){
        this.timeout(20);
        return axios.get('https://reqres.in/api/users?page=2')
        .then(res =>{
            expect(res.data.data[1].email).to.be.equal('lindsay.ferguson@reqres.in');
        })
        .catch(err =>{
            console.error('Error during test: ',err);
            throw err;
        });
    });
});
// describe.only('Test Suite 1',function(){
//     it('Promised based way ',function(){
//         this.timeout(20);
//         return axios.get('https://reqres.in/api/users?page=2')
//         .then(res =>{
//             expect(res.data.data[1].email).to.be.equal('lindsay.ferguson@reqres.in');
//         })
//         .catch(err =>{
//             console.error('Error during test: ',err);
//             throw err;
//         });
//     });
// });