# define the forms of grammar 

###### BNF:

factor:NUMBER|"("expression")"

term:factor{("*"|"/")factor}

expression:term{("+"|"-")term}

> tips:
>
> - {pat}:pat can appear any times include zero
> - [pat]: pat must appear one or more times
> - pat1|pat2:match pat1 or pat2
> - ():consider all contents of the parentheses as a complete pattern

 

###### Grammar:

G[S]:

​    S->A|A'

​    A'->"+"AA'|"-"AA'|ε

​    A->B|B'

​    B'->"*"BB'|"/"BB'|ε

​    B->number|"("S")"