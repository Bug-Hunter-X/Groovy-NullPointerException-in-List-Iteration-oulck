```groovy
def myMethod(List<String> list) {
  list?.each { it ->
    println it.toUpperCase()
  }
}

myMethod(null) //This will no longer throw an exception

//Alternative solution with explicit null check
def myMethodAlt(List<String> list) {
  if(list != null) {
    list.each { it ->
      println it.toUpperCase()
    }
  }
}

myMethodAlt(null) //This will also no longer throw an exception
```