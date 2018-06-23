package jeff_code

import "fmt"

func main()  {
	var a [5]int = [5]int{5,7,3,9,2}

	for i:=0; i< len(a)-1; i++{
		for j := 0;j < len(a) -i -1;j++  {
			if a[j]>a[j+1]{
				a[j], a[j+1] = a[j+1], a[j]
			}
		}
	}

	for s :=0; s< len(a);s++{
		fmt.Println(a[s])
	}

}
