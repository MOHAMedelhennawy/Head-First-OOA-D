## The code working well, but the door doesn't automatically close!

So we need more encapsulation rather than duplicate auto-close code.
To fix it we can move auto-close code to open method in DogDoor class.

So, it's better to move auto-close to open method to work with any thing
such as BarkRecognizer, Remote or any thing can be added in the future
without need to duplicate code.
