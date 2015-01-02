DESCRIPTION = "my first recipe for bitbake hello world"

inherit autotools

PN = 'firstrecipe'
PV = '1.0'
python do_build() {
    bb.note("--------MINI test note---------\n");

    bb.plain("****************");
    bb.plain("\nHello, World!\n");
    bb.plain("****************");
}


