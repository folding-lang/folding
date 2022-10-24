/*
 *
 * This is the compiled code.
 * Actually, this is not real going to compile same as this.
 * This is just a imagination of compilation.
 *
 */

export function bind(value,func) {
    return func(value)
}

export function myFunc(x) {
    return ((x * 2) + 7) * (x + 9);
}

export function main() {
    function _do$main() {
        console.log(bind(1,myFunc))
    }
    return _do$main()
}