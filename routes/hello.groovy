from('timer:tick?period=3000')
  .setBody().constant("Hello world from Camel K - 1")
  .to('log:info')

from('timer:tick?period=3000')
  .setBody().constant("Hello world from Camel K - 2")
  .to('log:info')