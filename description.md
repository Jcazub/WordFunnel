**Challenge**

Given two strings of letters, determine whether the second can be made from the first by removing one letter. The remaining letters must stay in the same order.

**Examples**

funnel("leave", "eave") => true
funnel("reset", "rest") => true
funnel("dragoon", "dragon") => true
funnel("eave", "leave") => false
funnel("sleet", "lets") => false
funnel("skiff", "ski") => false

**Brainstorm**

Split the first word into it's character set.

For each character, we want to build another word,
excluding the character chosen.

Then compare this new word vs. the second word