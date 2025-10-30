## Shop

- Item is the parent of MagicItem and MusicItem
- MagicItem is the child of Item and the parent of Wand and Potion
- MusicItem is the child of Item and the parent of Guitar and DrumKit

````
┌──────────┐
│   Item   │------------
└─────┬────┘            |
│                       |
┌─────┴─────┐           |
│           │           |    
│ MagicItem │     MusicItem
├───────────┤     ├───────────┤
│   Wand    │     │   Guitar  │
├───────────┤     ├───────────┤
│   Potion  │     │  DrumKit  │
└───────────┘     └───────────┘
````
