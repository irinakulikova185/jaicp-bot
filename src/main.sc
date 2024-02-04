require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Привет! Я бот-консультант кинотеатра! Я могу уточнить расписании сеансов, помочь с покупкой билета, рассказать о новинках последней недели, ожидаемых премьерах, а также ациях в нашем кинотеатре.
        

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}