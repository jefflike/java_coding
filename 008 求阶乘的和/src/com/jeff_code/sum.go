package jeff_code

import "fmt"

func diGui(a int) int  {
	if(a == 1){
		return 1
	}
	return a * diGui(a-1)
}

func main()  {
	sum := 0
	for i :=1; i<=20; i++ {
		sum += diGui(i)
	}
	fmt.Println(sum)
}


