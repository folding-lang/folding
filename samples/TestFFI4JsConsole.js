/*
 *
 * The names of the functions for each external definition are follow the compilation rules of identifier.
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