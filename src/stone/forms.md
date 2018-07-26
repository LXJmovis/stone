# define the forms of grammar 

###### BNF:

primary:"("expr")"|NUMBER|IDENTIFIER|STRING

factor:"-"primary|primary

expr:factor{OP factor}

block:"{"[statement]{(";"|EOL)[statement]}"}"

simple:expr

statement:"if" expr block ["else" block]|"while" expr block|simple

program:\[statement](";"|EOL)

> tips:
>
> - {pat}:pat can appear any times include zero
> - [pat]: pat must appear one or more times
> - pat1|pat2:match pat1 or pat2
> - ():consider all contents of the parentheses as a complete pattern

