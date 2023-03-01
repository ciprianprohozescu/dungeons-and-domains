import pyauparser

g = pyauparser.Grammar.load_file("pogl.egt")

tree = pyauparser.parse_string_to_tree(g, "state hello \"hello\"")

tree.dump()