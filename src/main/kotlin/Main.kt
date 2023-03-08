fun main(){

var car = Car("Subaru", "Legacy", "White", 20)
car.carry(30)
    car.identity()

    var bus = Bus("Iveco", "Legend", "Yellow", 40)
    bus.maxTripFare(arrayOf(300.0,500.0,900.0,600.0))
    println(bus.maxTripFare(arrayOf(300.0,500.0,900.0,600.0)))
    println(bus.calculateParkingFees(5))
}

open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry (people:Int){
        if (people<=20){
            println("Carrying $people passengers")
        }
        else {
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
fun identity(){
println("I am a $color $make $model ")
    }
    open fun calculateParkingFees(hours: Int):Int{
        var parkingFees = hours* 20
        return parkingFees

    }
}

class Bus(make: String, model: String, color: String, capacity:Int):Car(make,model,color,capacity){
fun maxTripFare(fare:Array<Double>):Double{
    return fare.max()
}

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var parkingFees = hours * capacity
        return parkingFees
    }

}
