(define sig
    (lambda (d m ano)
        (define a (remainder ano 100)) ;ex: 1989 => a = 89
        (define s (-(quotient a 100) 1)); s = 19
        (define mint (quotient (- (* 13 m) 1) 5) )
        (define aint (quotient a 4))
        (define sint (quotient s 4))
        
        (define x (remainder (- (+  mint aint sint d a) (* 2 s)) 7))
        (cond
            ((= x 1) "domingo")
            ((= x 2) "segunda")
            ((= x 3) "terca")
            ((= x 4) "quarta")
            ((= x 5) "quinta")
            ((= x 6) "sexta")
            ((= x 7) "sabado")
            (else     0))))
(display (sig 4 7 1989))
(newline)
(newline)