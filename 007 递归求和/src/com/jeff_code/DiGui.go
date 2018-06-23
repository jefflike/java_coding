package jeff_code

func DiGui( a int) int {
	if a == 1{
		return 1
	}else {
		return a + DiGui(a-1)
	}

}

func main()  {
	b := 10
	DiGui(b)
}
