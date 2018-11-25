class Isogram
  def self.isogram?(input)
    all_letters = input.downcase.scan(/\w/)
    all_letters.length == all_letters.uniq.length
  end
end
