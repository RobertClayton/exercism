class Matrix
  attr_reader :grid

  def initialize(grid)
    @grid = grid
  end

  def rows
    @grid.each_line.map {|row| row.split.map(&:to_i)}
  end

  def columns
    @columns ||= rows.transpose
  end
end
