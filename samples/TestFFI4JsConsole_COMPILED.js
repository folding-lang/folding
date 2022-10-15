/*
 *
 * Actually, the 'TestFFI4JsConsole' is not real going to compile same as this.
 * This is just a imagination of compilation.
 *
 */

class Console {
}

function console_0() {
    return console;
}

function Console_log_0() {
    return function(Console_this) {
        return function(Console_log_0_msg) {
            return Console_this.log(Console_log_0_msg);
        }
    }
}

function myFunc_Calc_a_0() {
    return function(myFunc_Calc_a_0_x) {
        return (myFunc_Calc_a_0_x * 2 + 7) * (myFunc_Calc_a_0_x + 9);
    }
}

function main_0() {
    return immediately(function do_0() {
        return function() {
            Console_log_0()(console_0())(myFunc_Calc_a_0()(1));
        }
    });
}

/*
 * // this will be the 'immediately' function.
 * function immediately(func) { return func() }
 */