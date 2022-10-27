/*
 *
 * This is the compiled code.
 * Actually, this is not real going to compile same as this.
 * This is just a imagination of compilation.
 *
 */

export function pipe(value,func) {
    return func(value)
}

export function myFunc(x) {
    return ((x * 2) + 7) * (x + 9);
}

function _do$main() {
    console.log(pipe(1,myFunc))
}

export function main() {
    return _do$main()
}