/*
golang要写到工作区GOPATH,代码如下
*/
package jeff_code

import "fmt"

func main()  {
	s := 0
	for i :=1; i<100; i++{
		if i%2==0{continue}
		s += i ;
	}
	fmt.Println(s)
}
