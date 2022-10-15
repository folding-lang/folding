/*
 *
 * Actually, the 'TestFFI4JsConsole' is not real going to compile same as this.
 * This is just a imagination of compilation.
 *
 */

function console_0_Console() {
    return console
}

function Console_log_0_Unit() {
    return function(this_Console) {
        return function(Console_log_0_msg_String) {
            return this_Console.log(Console_log_0_msg_String)
        }
    }
}

function myFunc_Calc_a_0() {
    return function(myFunc_Calc$a$_0_x_a) {
        return (myFunc_Calc$a$_0_x_a * 2 + 7) * (myFunc_Calc$a$_0_x_a + 9)
    }
}

function main_0() {
    function do_0_main_0() {
        Console_log_0_Unit()(console_0_Console())(myFunc_Calc_a_0()(1))
    }
    return do_0_main_0
}