//punto de partida / primera iteracion
var n = 1.0
var i = 1 //contador de iteraciones
var a = 0.0 //auxiliar
//probamos las funciones
var fx = math.pow(n,3)-n-1 //x3-x-1  / x= 1 fx= -1
print (fx)
var fxD = 3 * (math.pow(n,2)) - 1  //3*x2-1   /  x= 1  fx´= 2
print (fxD)
var formula = n - (fx/fxD)   // Xn+1 = Xn - f(xn) / f´(xn)  / x = 1  f=1.5
print(formula)

//Metodo para iterar creado con el uso de todas las funciones necesarias
def newtonRaphson(): Double = {
  var fx = math.pow(n,3)-n-1
  var fxD = 3 * (math.pow(n,2)) - 1
  var formula = n - (fx/fxD)
  println("Iteracion nro: " + i + " --> resultado: " + n)
//repetir la funcion hasta obtener el mas aproximado
  n = formula //Hacer que el punto de partida sea el resultado obtenido
  if (n == a) return n //con esto hacemos que la operacion se repita hasta
    a = n              //obtener el numero mas aproximado a la raiz
    i += 1
  newtonRaphson()
}

var fin = newtonRaphson()
println("Aproximacion de la raiz: " + fin) //= 1.3247