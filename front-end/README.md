# Demo Observable - event stream
## Event stream
- Event stream in reactive programming consists of a series of events from a single source.
- Each of these events may be passed or failed.
- The stream doesnt prevent the next event from executing when an event fails.
- At the end of the stream, source send a signal indicating that the stream completed.

## Observable: 
- Promise get the result once. Observable can get the result from its source multiple times.
- Event Stream in RxJS can be viewed as Observable object.

## Demo app
- ChatAppComponent receive msg from user, send to ChattingService
- ChattingService send this msg to ChatBotService
- ChatBot pick a random msg from a list and emits it as next valuein observable object.
- ChattingService subscribe to the Observable provided by ChatBotService
- ChatAppComponent subscribe to Observable provided by ChattingServcie and display to user