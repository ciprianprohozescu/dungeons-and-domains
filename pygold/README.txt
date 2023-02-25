0x00: About
    PyGOLD, a Python translation of GOLD Parser Engine
    Author:
        Milosz A. Krajewski <mkrajewski@users.sourceforge.net>
    Original code by:
        Devin Cook (http://www.devincook.com)
        Marcus Klimstra <klimstra@home.nl>

0x01: Origins
    This code is near 1-to-1 translation of C# Engine by Marcus Klimstra.

0x02: Idea
    Pure Python implementation of GOLD Parser Engine.
    GOLD Parser Engine is a LALR(1) parser with DFA tokenizer.
    To use GOLD Parser Engine you must generate compiled grammar table
    with GOLD Parser Builder (not included).
    GOLD Parser Builder can be found on http://www.devincook.com/goldparser.
    Though GPBuilder is a Win32 application, you can use .CGT (compiled grammar)
    anywhere you want.

    See http://www.devincook.com/goldparser for details.

0x03: Change log
    0.9:
        + Initial release
    0.9.1:
        + major bugfixes
        + some performance improvements

0x04: Known bugs
    - Engine does not work with unicode charsets
