//問1:isEven関数を実行して、以下の配列から偶数だけが出力されるように実装してください。

let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven() {
    for(let a = 0; a < numbers.length; a++){
        if(numbers [a] % 2 === 0){
            num = numbers [a];
            console.log(num + 'は偶数です');
        }
    }
}
isEven();

/*問2:以下の要件を満たすように実装してください。
【要件】
・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する*/
 class Car  {
    constructor(gass,number){
        this.gass =gass;
        this.number =number;
    }
//・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
getNumGas(){
    console.log('ガソリンは'+this.gass +'です。ナンバーは'+this.number+'です');
}
}

let car =new Car('〇〇','△△');
car.getNumGas();