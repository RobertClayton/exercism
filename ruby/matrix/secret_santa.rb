require 'pry'

class SecretSanta
  attr_accessor :all, :check

  def initialize
    @all = %w(Anthony Gill Mike Emily Matt-Clayton Laura Robbie Evelina Nanny Grandad Richard Trisha Tom Lauren Poppy Matt)
    @check = {
      'Anthony' => 'Gill', 'Gill' => 'Anthony',
      'Mike' => 'Emily', 'Emily' => 'Mike',
      'Matt-Clayton' => 'Laura', 'Laura' => 'Matt-Clayton',
      'Robbie' => 'Evelina', 'Evelina' => 'Robbie',
      'Nanny' => 'Grandad', 'Grandad' => 'Nanny',
      'Richard' => 'Trisha', 'Trisha' => 'Richard',
      'Tom' => 'Lauren', 'Lauren' => 'Tom',
      'Poppy' => 'Matt', 'Matt' => 'Poppy',
    }
  end

  def self.calculate
    # @all = %w(Anthony Gill Mike Emily Matt-Clayton Laura Robbie Evelina Nanny Grandad Richard Trisha Tom Lauren Poppy Matt)
    # @check = {
    #   'Anthony' => 'Gill', 'Gill' => 'Anthony',
    #   'Mike' => 'Emily', 'Emily' => 'Mike',
    #   'Matt-Clayton' => 'Laura', 'Laura' => 'Matt-Clayton',
    #   'Robbie' => 'Evelina', 'Evelina' => 'Robbie',
    #   'Nanny' => 'Grandad', 'Grandad' => 'Nanny',
    #   'Richard' => 'Trisha', 'Trisha' => 'Richard',
    #   'Tom' => 'Lauren', 'Lauren' => 'Tom',
    #   'Poppy' => 'Matt', 'Matt' => 'Poppy',
    # }

    people = {}
    @all.each { |person| people[person] = 0 }

    no_matches = false
    until no_matches do
      combo = @all.shuffle

      i = 0
      people.each do |k, _|
        people[k] = combo[i]
        i += 1
      end

      pair = false
      people.each do |k, v|
        pair = true if k == v
        pair = true if @check[k] == v
      end

      no_matches = true unless pair
      people
    end

    people
  end
end
new = SecretSanta.new
puts SecretSanta.calculate
