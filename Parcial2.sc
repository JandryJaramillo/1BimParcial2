//punto de partida / primera iteracion
var n : Float = 1
var i = 1 //contador de iteraciones
var a: Float = 0 //auxiliar
//probamos las funciones
var fx = math.pow(n,2)-10 //x2-10  / x= 1 fx= -9
print (fx)
var fxD = 2 * n  //2x  /  x= 1  fx´= 2
print (fxD)
var formula = n - (fx/fxD)   // Xn+1 = Xn - f(xn) / f´(xn)  / x = 1  f=5.5
print(formula)

//Metodo para iterar creado con el uso de todas las funciones necesarias
def newtonRaphson(): Float = {
  var fx: Float = math.pow(n,2).toFloat - 10
  var fxD: Float = (2 * n).toFloat
  var formula: Float = n - (fx/fxD)
  println("Iteracion nro: " + i + " --> resultado: " + n)
  //repetir la funcion hasta obtener el mas aproximado
  n = formula //Hacer que el punto de partida sea el resultado obtenido
  if (n == a) return n //con esto hacemos que la operacion se repita hasta
  a = n              //obtener el numero mas aproximado a la raiz
  i += 1
  newtonRaphson()
}

var fin = newtonRaphson()
println("Aproximacion de la raiz: " + fin) //= 3.1622 == Raiz de 10