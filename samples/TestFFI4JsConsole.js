/*
 *
 * The names of the functions for each external definition are follow the compilation rules of identifier.
 *
 */

function console_0() {
    return console
}

function Console_log_0() {
    return function(Console_this) {
        return function(Console_log_0_msg) {
            return Console_this.log(Console_log_0_msg)
        }
    }
}