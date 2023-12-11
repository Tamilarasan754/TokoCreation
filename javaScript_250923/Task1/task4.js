let arr=[];
arr.push('Grace','Kia','Grace','Grace','Grace','Grace','ki','ki','ki','Grace');
let IndexFirstGrace=arr.indexOf('Grace');//0
let IndexLastGrace=arr.lastIndexOf('Grace');//4
let v=IndexFirstGrace+1;
arr.forEach(element => {
    if(v!=IndexLastGrace)
    {
    let IndexCenterGrace=element.indexOf('Grace',v);
    v=IndexCenterGrace+1;
    console.log(IndexCenterGrace);
    }
    
});
//1
