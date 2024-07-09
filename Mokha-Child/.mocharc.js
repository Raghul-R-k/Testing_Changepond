module.exports={
    ui : 'bdd',
    //ui : 'tdd'
    timeout : 20, //timeout after 20 ms
    slow : 150,
    reporter : 'spec',
    retries : 3 , //(last precedence testcase execution count,if it is 3 ,then it will be run for 3 times)
    'watch-files' : ['test/**/*.js']
}